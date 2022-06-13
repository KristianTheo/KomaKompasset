"use strict";
exports.__esModule = true;
var tslib_1 = require("tslib");
var vue_router_1 = require("vue-router");
var MainView_vue_1 = tslib_1.__importDefault(require("../views/MainView.vue"));
var router = vue_router_1.createRouter({
    history: vue_router_1.createWebHistory(process.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'main',
            component: MainView_vue_1["default"]
        }
    ]
});
exports["default"] = router;
//# sourceMappingURL=index.js.map