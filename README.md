# Java4
shiyan4

##实验目的
1.掌握字符串String及其方法的使用。
2.掌握文件的读取/写入方法。
3.掌握异常处理结构。

##实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
文件A包括两部分内容：
一是学生的基本信息；
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
4.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………

##实验要求
1.设计学生类（可利用之前的）；
2.采用交互式方式实例化某学生；
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。

##核心方法
Java文件的读取基本方法:读取文件需要用到FIle、FileInputStream、FileReader、BufferedReader等实现文件读取。
关于String类的基本操作：1.基本操作方法。2.字符串比较。3.字符串与其他数据类型之间的转换。4.字符与字符串的查找5.字符串的截取与拆分。6.字符串的替换与修改。

##实验结果
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。

##实验感想
通过本次实验对string字符串了解及其作用有了更深入地掌握，学会了在Java中如何写入。
关于文件的写入，主要有三种方法，分别使用FileWriter、FileOutputStream和BufferedOutputStream。同时也了解了异处理结构，异常是程序中的一些错误，错误可能来源于程序本身错误，也可能是用户误操作所致，还可能是物理因素引起的。由但并不是所有的错误都是异常，并且错误有时候是可以避免的。Java异常处理分为三种类型的异常：可检查性异常，运行时异常，错误。今后自己将会更加努力的学习Java课程，把所学的知识更多的应用在实践中。
