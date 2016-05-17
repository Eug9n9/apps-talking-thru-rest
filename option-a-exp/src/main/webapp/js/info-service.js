(function() {
  'use strict';
  var service = angular.module('info-service', []).service('infoService', ['$http', function($http) {

    function extract(response, status, headers, config) {
      return response.data;
    }

    this.createInfo = function() {
      return $http.get('/createInfo')
        .then(extract)
        .catch(function(message) {
          console.log(message);
        });
    };

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