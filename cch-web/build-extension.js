const path = require('path');
const glob = require('glob');
const fs = require('fs');

if(!process.argv.splice(2) || process.argv.splice(2).length === 0) {
    throw new Error('No args found');
    return;
}

const files = glob.sync(path.join('./dist/cch-web', `./**/*.{js.map,}`));

for (const file of files) {
    fs.copyFile(file, `./dist/${file.substr(file.lastIndexOf('/'), file.length - 1)}`, err => { });
}