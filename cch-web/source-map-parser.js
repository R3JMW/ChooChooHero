const ErrorStackParser = require('error-stack-parser');
const { SourceMapConsumer } = require('source-map');
const path = require('path');
const fs = require('fs');

class StackParser {

    constructor() {
        this.consumers = {};
        // this.stackFrame = ErrorStackParser.parse(new Error(`Error: InvalidPipeArgument: 'Unable to convert \"aaaa\" into a date' for pipe 't'\n    at st (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:331591)\n    at transform (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:337382)\n    at http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:268813\n    at Object.ku (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:268887)\n    at template (http://localhost:4100/8-es2015.6b4e162760732af5a0f9.js:1:1123)\n    at Qr (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:210999)\n    at Yr (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:209574)\n    at vi (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:216950)\n    at http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:210504\n    at Yr (http://localhost:4100/main-es2015.156bc6adb61f8fd967ad.js:1:210515)`));
        this.stackFrame = ErrorStackParser.parse(new Error(`TypeError: Cannot read property 'aDataSort' of undefined\n    at Ye (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:130328)\n    at tt (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:132486)\n    at I (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:96001)\n    at HTMLTableElement.<anonymous> (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:97025)\n    at Function.each (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:2977)\n    at x.fn.init.each (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:1451)\n    at x.fn.init.l [as dataTable] (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:92046)\n    at x.fn.init.e.fn.DataTable (http://localhost:4100/scripts.fe3db41de252d60c642d.js:1:172547)\n    at http://localhost:4100/common-es2015.84b13a8617aaecde1c8c.js:1:1120\n    at l.invokeTask (http://localhost:4100/polyfills-es2015.bb98ddc7b1aed200dc3e.js:1:7242)`));
    }

    async getOriginStack() {
        const origin = [];
        for (const s of this.stackFrame) {
            origin.push(await this.getOriginPosition(s))
        }

        Object.keys(this.consumers).forEach(key => {
            this.consumers[key].destroy();
        });

        return origin;
    }

    async getOriginPosition(stackFrame) {
        const { columnNumber, lineNumber, fileName } = stackFrame;
        const file = path.basename(fileName);
        let consumer = this.consumers[file];
        if (consumer === undefined) {
            const sourceMapPath = path.resolve(`./dist/cch-web/${file}.map`);
            if (!fs.existsSync(sourceMapPath)) {
                return stackFrame;
            }
            const content = fs.readFileSync(sourceMapPath, 'utf8');
            if(!content) {
                return stackFrame;
            }
            consumer = await new SourceMapConsumer(content, null);
            this.consumers[file] = consumer;
        }
        const parse = consumer.originalPositionFor({ line: lineNumber, column: columnNumber });
        return parse;
    }
}

new StackParser().getOriginStack().then(e => console.log(e));