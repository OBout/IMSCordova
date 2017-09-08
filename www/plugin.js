
var exec = require('cordova/exec');

var PLUGIN_NAME = 'IMSCordovaPlugin';

var IMSCordovaPlugin = {
  registerIMSevent: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'registerIMSevent', []);
  }
};

module.exports = IMSCordovaPlugin;
