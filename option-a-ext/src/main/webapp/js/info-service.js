(function() {
  'use strict';
  var service = angular.module('info-service', []).service('infoService', ['$http', function($http) {

    function extract(response, status, headers, config) {
      console.log("Data to/from remote application exchanged successfully");
      return response.data;
    }

    this.loadInfo = function(id) {
        return $http.get('/loadInfo/' + id)
        .then(extract)
        .catch(function(message) {
          console.log(message);
        });
    };

    this.updateInfo = function(info) {
        return $http.post('/updateInfo', info)
        .then(extract)
        .catch(function(message) {
          console.log(message);
        });
    };

  }]);
})();