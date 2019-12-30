gradle build 중 만난 오류이다.
~~~
java.lang.NoClassDefFoundError: org/gradle/api/internal/plugins/DefaultConvention
	at org.jetbrains.plugins.gradle.tooling.builder.ProjectExtensionsDataBuilderImpl.buildAll(ProjectExtensionsDataBuilderImpl.groovy:50)
	...
	at java.lang.Thread.run(Thread.java:748)
~~~
`gradle-wrapper.properties`에 들어가보니 `distributionUrl`이 `gradle-6.0.1-bin.zip`라고 설정돼있었다. `gradle-5.6.4-bin.zip`로 바꿔주니 정상적으로 빌드되었다.
