<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
    <script>
        var app = angular.module('myApp', []);
        app.controller('customersCtrl', function ($scope, $http) {
            $http.get("/list").then(function (response) {
                $scope.names = response.data;
            });
        });
    </script>
</head>

<body>
    <div ng-app="myApp" ng-controller="customersCtrl">
        <table border=1>
            <tr ng-repeat="x in names">
                <td>{{ x.name }}</td>
                <td>{{ x.age }}</td>
            </tr>
        </table>
    </div>
</body>

</html>