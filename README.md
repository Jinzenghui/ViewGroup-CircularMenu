# ViewGroup-CircularMenu
ViewGroup的使用练习
这个项目主要是练习ViewGroup的使用.
ViewGroup有两个函数需要重写：
  1，onMeasure():用来计算子View的尺寸，计算得到考虑三种模式的尺寸要求，以及padding和margin.
  2，onLayout():用来确定子View的区域。
项目中还定义了一个BaseAdapter类PanAdapter用于添加子View.
