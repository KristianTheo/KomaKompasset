"use strict";
exports.__esModule = true;
var tslib_1 = require("tslib");
require("dkfds/dist/css/dkfds.min.css");
require("dkfds/dist/css/dkfds-virkdk.min.css");
var vue_1 = require("vue");
var App_vue_1 = require("./App.vue");
var router_1 = tslib_1.__importDefault(require("./router"));
var app = vue_1.createApp(App_vue_1.App);
app.use(router_1["default"]);
app.mount('#app');
//# sourceMappingURL=main.js.map