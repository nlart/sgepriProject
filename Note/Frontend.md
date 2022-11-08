## HTML篇
1. HTML：超文本标记语言。HTML是一种标记语言，而非编程语言，通过一套标记标签（如：p标签，a标签等）来描述网页。
2. HTML标签：用尖括号包围，通常成对出现并对包围中的文本进行特定描述及展示的“标记符号”，如（\<p><\/p>, \<h1><\/h1>等）。
3. HTML文档：包含HTML标签和文本的文档，通常也被称之为“网页”。
4. 工作原理：浏览器读取HTML文档，以网页的形式展示文本。其中HTML标签不展示，标签内文本通过HTML标签解释（展示）
5. <a href="https://www.w3school.com.cn/tags/index.asp">标签</a>
6. 
   .类名 { ... }，class不唯一
   #id名 { ... }，id唯一，可用于作为书签
   
## CSS篇

## JavaScript篇
1.js是一门高级、动态、解释型编程语言，适合面向对象和函数式编程；


1.功能：
直接写入html输出流，对事件反应，改变html内容，改变html图像，改变html样式，验证输入
2.js显示数据的几种方式：
   window.alert()
   document.write()
   innerHTML
   console.log()

   ECharts笔记：
   1.trigger：axis/item
   触发类型：轴触发；
      axis：鼠标hover到一条柱状图则显示全部数据
      item：鼠标hover到一个折线点则显示对应数据
   2.axisPointer:{
      type: "line",  (默认为line，还有"cross"、"shadow")
   }
   触发类型：坐标轴触发；
   line：鼠标移动到柱状图上，显示为直线；
   cross：鼠标移动到柱状图上，显示为交叉线；
   shadow：鼠标移动到柱状图上，显示为灰色方框；

   3.legend: {
      "orient": "vertical",   (vertical垂直显示，horizontal水平显示)
      "icon": "rect",   (circle/rect/line/roundRect/triangle/diamond/pin/arrow/none)
      "itemWidth": "10",  
      "itemHeight": "4",
      "itemGap": "24", // 设置间距
      "data": ['最高温', '最低温'],
      "textStyle": {
         //文字样式
         "color": '#c1dafc',
         "fontSize": '12'
      },
      selected: {
         "最高温": false,
         "最低温" false,
      }
   }
   legend:  对图表中图形的解释，如：蓝色柱状图代表温度等；
   orient:  设置图例的朝向
   itemWidth:  图标宽度；
   itemHeight: 图标高度；
   itemGap: 设置间距;
   x/y(left/top): 设置图例在X轴方向上的位置以及在Y轴方向上的位置；
   backgroundColor:  背景颜色；
   borderColor:   边框颜色；
   borderWidth:   边框宽度；
   padding: 内边距；
   textStyle:  设置图例文字样式(color, fontSize, fontWeight)；
   selected:   设置图例的某个选项的数据默认是显示还是隐藏；

   参考文献：https://blog.csdn.net/chen__cheng/article/details/118388833