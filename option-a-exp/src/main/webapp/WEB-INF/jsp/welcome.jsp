<!DOCTYPE html>
<html lang="en" ng-app="info">

<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no">
<meta charset="UTF-8">
<title>Integrating Experience with an external application - Option A</title>
</head>

<body ng-controller="InfoCtrl" ng-cloak>
<h1>Welcome to the Experience</h1>
<hr/>

<form name="infoForm">
<label>Update Name: <input type="text" ng-model="name"/></label>
<button ng-click="update()" ng-disabled="!name || infoForm.$invalid">Submit</button>
</form>
<hr/>

<div>
Data contains: {{info}}
</div>
<hr/>

Click <a href="${externalUrl}?refId={{info.refId}}">this link</a> to go to the external application...

<script src="js/angular.js"></script>
<script src="js/info-service.js"></script>
<script src="js/info.js"></script>
</body>
</html>