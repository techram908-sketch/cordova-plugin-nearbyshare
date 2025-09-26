var exec = require('cordova/exec');

var NearbyShareHelper = {
    shareText: function(text, success, error) {
        exec(success, error, "NearbyShareHelper", "shareText", [text]);
    }
};

module.exports = NearbyShareHelper;
