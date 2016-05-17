<!DOCTYPE html>
<html lang="en" ng-app="info">

<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<meta charset="UTF-8">
<title>Integrating Experience with an external application - Option A</title>
</head>

<body ng-controller="InfoCtrl" ng-cloak>
<h1>Welcome to the External Application</h1>
<hr/>

<form name="infoForm">
<label>Update Amount: <input type="number" ng-model="amount"/></label>
<button ng-click="update()" ng-disabled="!amount || infoForm.$invalid">Submit</button>
</form>
<hr/>

<div>
Data contains: {{info}}
</div>
<hr/>

Click <a href="${experienceUrl}?refId={{info.refId}}">this link</a> to go back to the experience application...

<script src="js/angular.js"></script>
<script src="js/info-service.js"></script>
<script src="js/info.js"></script>
</body>
</html>