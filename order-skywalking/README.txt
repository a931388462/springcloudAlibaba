如果要接入skywalking,运行时添加启动参数

-javaagent:D:\skywalking-agent\skywalking-agent.jar
-DSW_AGENT_NAME=order-service
-DSW_AGENT_COLLECTOR_BACKEND_SERVICES=localhost:11800

1.skywalking-agent.jar位置
2.接入后页面显示的服务名称
3.skywalking接收端地址


skywalking9之后，skywalking-agent.jar要单独下载