package com.repair.pojo.dto;

/**
 * 巡检的设备类
 */
public class DetectDevice {
    private String name;

    private Integer state;

    private String mark;

    public DetectDevice() {<!-- 配置Spring mvc -->
	<!-- 开启Spring mvc注解模式 -->
	<mvc:annotation-driven></mvc:annotation-driven>

	<!-- 加入对静态资源的处理   允许使用/做资源配置-->
	<mvc:default-servlet-handler/>

	<!-- 配置jsp显示ViewEwslover -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"></property>
		<property name="prefix" value="/WEB-INF/jsp/"></property>
		<property name="suffix" value=".jsp"></property>
	</bean>

	<!-- 扫描web相关的包 -->
	<context:component-scan base-package="org.seckill.web"></context:component-scan>
    }

    public DetectDevice(String name, Integer state, String mark) {
        this.name = name;
        this.state = state;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "DetectDevice{" +
                "name='" + name + '\'' +
                ", state=" + state +
                ", mark='" + mark + '\'' +
                '}';
    }
}
