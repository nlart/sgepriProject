# Vue学习路线
0.前置学习：HTML，CSS，JS，Jquery，BootStrap
1.准备工作（环境安装配置等）
2.官方文档
3.相关教程（菜鸟教程，尚硅谷等）
4.项目实战（GitHub等）

相关学习网站：
w3cschool：https://www.w3school.com.cn/index.html
菜鸟：https://www.runoob.com/js/js-tutorial.html
## 1. 准备工作：
安装Vue Chrome插件：https://devtools.vuejs.org/guide/installation.html
安装npm，查看npm版本：npm -v
npm转换成淘宝镜像：$ npm install -g cnpm --registry=https://registry.npmmirror.com
升级npm：cnpm install npm -g
升级或安装cnpm：npm install cnpm -g
全局安装vue-cil：npm install vue-cli -g

卸载npm： 
sudo npm uninstall npm -g
卸载node：
sudo rm -rf /usr/local/lib/node /usr/local/lib/node_modules /var/db/receipts/org.nodejs.*
sudo rm -rf /usr/local/include/node /Users/$USER/.npm 
sudo rm /usr/local/bin/node 
sudo rm /usr/local/share/man/man1/node.1
sudo rm /usr/local/lib/dtrace/node.d

## 2. 官方文档：
1.Vue官网：https://v3.cn.vuejs.org/   （Vue 3.x）


vscode下使用脚手架安装vue项目
1.安装插件：    
volar插件+eslint插件
2.新建终端：    
vscode顶端菜单“终端”——新建终端
3.创建vue项目： 
vue init webpack 工程名称（例：vue init webpack vue_test）
4.报错：        
Command vue init requires a global addon to be installed.
Please run npm i -g @vue/cli-init and try again.
5.解决方案：
sudo npm i -g @vue/cli-init
6.项目创建选择：
遇到y/n选择y，其余直接回车
7.安装成功：
cd vueTest
npm run dev
8.浏览器打开：
http://localhost:8080