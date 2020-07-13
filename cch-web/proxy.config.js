const proxy = [
  {
    context: ['/user', '/auth/login'],
    target: 'http://localhost:8080',
    secure: false
  }
];

module.exports = proxy;
