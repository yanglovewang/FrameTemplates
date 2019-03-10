
### 简单表达式
- 变量表达式：$ {...}
- 选择变量表达式：\* {...}
- 消息表达式：＃{...}
- 链接⽹址表达式：@ {...}
- ⽚段表达式：〜{...}

### 文字
- 数字字⾯值：0,34,3.0,12.3，...
- 布尔⽂字：true，false
- 空字⾯值：null
- ⽂字Token：one，sometext，main，...

### ⽂本操作
- 字符串连接：+
- ⽂本替换：|The name is ${name}|
- 算术运算符
    - ⼆进制运算符：+，-，\*，/，%
    - 负号（⼀元运算符）：-
- 布尔运算符
    - ⼆进制运算符：and 、or
    - 布尔否定（⼀元运算符）：！，not
- ⽐较和相等运算符：
    - ⽐较运算符：&gt;，&lt;，&gt; =，&lt;=（gt，lt，ge，le）
    - 相等运算符：==，！=（eq，ne）
条件运算符：
    - If-then:\(if\) ? \(then\)
    - If-then-else:\(if\) ? \(then\) : \(else\)
    - Default:\(value\) ?: \(defaultvalue\)

### 基本表达式对象
- \#ctx：上下⽂对象。
- \#vars：上下⽂变量。
- \#locale：上下⽂区域设置。
- \#request :(仅在Web Contexts中）HttpServletRequest对象。
- \#response：（仅在Web上下⽂中）HttpServletResponse对象。
- \#session :(仅在Web上下⽂中）HttpSession对象。
- \#servletContext :(仅在Web上下⽂中）ServletContext对象。

### 文本别名
前缀$后缀;
gt（>），
lt（<），ge（> =），le（<=），⾮（！）。 还有eq（==），neq /
ne（！=）。