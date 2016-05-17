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
      console.log("RefId is not provided");
    }

    $scope.update = function() {
      infoService.updateInfo({ refId: $scope.info.refId, amount: $scope.amount }).then(extract);
      $scope.amount = null;
    };

    function extract(data){
      $scope.info = data;
      console.log(JSON.stringify($scope.info));
    };
  }]);

})();