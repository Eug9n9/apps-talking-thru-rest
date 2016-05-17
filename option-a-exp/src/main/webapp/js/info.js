(function() {
  'use strict';
  var app = angular.module('info', ['info-service']);

  app.controller('InfoCtrl', ['$scope', '$location', 'infoService', function($scope, $location, infoService) {

    var url = $location.absUrl();
    var marker = url.indexOf('refId=');
    if (marker > 0) {
      var refId = url.substring(marker + 6);
      infoService.loadInfo(refId).then(extract);
    } else {
      infoService.createInfo().then(extract);
    }

    $scope.update = function() {
      infoService.updateInfo({ refId: $scope.info.refId, name: $scope.name }).then(extract);
      $scope.name = null;
    };

    function extract(data){
      $scope.info = data;
      console.log(JSON.stringify($scope.info));
    };
  }]);

})();