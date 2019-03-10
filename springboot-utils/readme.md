## 各种工具类

### 分页

### OOS存储

### 布局

- 水平居中
    - 宽度不确定
        - margin-left 20px
        - margin-right 20px
    - 宽度确定
        - margin-left: auto
        - margin-right: auto
- 垂直居中
    - 高度确定
        - padding-top: 20px
        - padding-buttom: 20px
        
    - 高度不确定
        - padding-top: 20px
        - padding-buttom: 20px
        
- div的父元素高度确定情况下做垂直居中
    - IE端用table
    - Chrome用flex
    
- 文字在div中垂直居中
    - 不要把div的height写死
    - padding-top
    - padding-right 
    - line-height
- 文字在div中水平居中
    - text-align
- margin合并
    - 如果父div没有boder挡住儿子div那么儿子div设置margin
    会和父元素合并
    - 如果不想用boder可以用padding来挡住儿子div
    - 或者用overflow

- 脱离文档流
- div的高度是内部所有文档流的元素的高度确定的
- 脱离文档流就是不算入div的高度里面
    - float
    - position：absolute
    
- 堆叠
    - tip:margin 是会自动往右扩展
    - 设置position后margin无效，可以通过padding设置div的宽高
    
    
    