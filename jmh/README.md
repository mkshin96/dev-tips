JMH
==== 

Java Microbenchmark Harness (JMH) is a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targetting the JVM.

Basic Considerations
----

The recommended way to run a JMH benchmark is to use Maven to setup a standalone project that depends 
on the JAR files of your application. This approach is preferred to ensure that the benchmarks are 
correctly initialized and produce reliable results. It is possible to run benchmarks from within an existing project, and even from within an IDE, however setup is more complex and the results are less reliable.

In all cases, the key to using JMH is enabling the annotation- or bytecode-processors to generate the synthetic benchmark code. Maven archetypes are the primary mechanism used to enable this. We strongly recommend new users make use of the archetype to setup the correct environment.

Preferred Usage: Command Line
----

1. Set up the benchmark project. The following command will generate the new JMH-driven project in _test_
folder:

    $ mvn archetype:generate \
    -DinteractiveMode=false \
          -DarchetypeGroupId=org.openjdk.jmh \
          -DarchetypeArtifactId=jmh-<b>java</b>-benchmark-archetype \
          -DgroupId=org.sample \
          -DartifactId=<i>test</i> \
          -Dversion=1.0


If you want to benchmark an alternative JVM language, use
another _archetype artifact ID_ from the <a href="http://central.maven.org/maven2/org/openjdk/jmh/">list of existing ones</a>, it usually amounts to replacing <b>java</b> to another
language in the artifact ID given below. Using alternative
archetypes may require additional changes in the build
configuration, see the <code>pom.xml</code> in the generated
project.

<li><b>Building the benchmarks.</b> After the project is generated,
you can build it with the following Maven command:
<blockquote>
<pre>$ cd test/
$ mvn clean install</pre></blockquote>
</li>
<li><b>Running the benchmarks.</b> After the build is done, you
will get the self-contained executable JAR, which holds your
benchmark, and all essential JMH infrastructure code:
<blockquote>
<pre>$ java -jar target/benchmarks.jar</pre></blockquote>
<p>Run with <i>-h</i> to see the command line options
available.</p>
</li>
</ul>
<p>When dealing with large projects, it is customary to keep the
benchmarks in a separate subproject, which then depends on the
tested modules via the usual build dependencies.</p>
<p><br /></p>
<h2>IDE support</h2>
<p>While the command line approach is the suggested one, some
people prefer to use IDEs. The user experience varies between
different IDEs, but we will outline the general things here.
Running benchmarks from the IDE is generally not recommended due to
generally uncontrolled environment in which the benchmarks run.</p>
<ul>
<li><b>Setting up the benchmarking project.</b> Some IDEs provide
the GUI to create the Maven project from the given archetype. Make
sure your IDE knows about Central archetype catalog, and look for
<i>org.openjdk.jmh:jmh-${lang}-benchmark-archetype</i> there.
Alternatively, you can use the command line to generate the
benchmark project, see above.
<p><b>NOTE</b>: JMH is not intended to be used in the same way as a
typical testing library such as JUnit. Simply adding the
<code>jmh-core</code> jar file to your build is not enough to be
able to run benchmarks.</p>
<br /></li>
<li><b>Building the benchmarks.</b>
<p>Most IDEs are able to open/import Maven projects, and infer the
build configuration from Maven project configuration. IDEA and
Netbeans are able to build JMH benchmark projects with little to no
effort. Eclipse build configuration may need to set up JMH
annotation processors to run.</p>
<br /></li>
<li><b>Running the benchmarks.</b> There is no direct support for
JMH benchmarks in the IDE, but one can use JMH Java API to invoke
the benchmark. It usually amounts to having the <code>main</code>
method, which will then call into JMH. See <a href="//hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/">
JMH Samples</a> for the examples of this approach. Before you run
any benchmark, the project build is required. Most IDEs do this
automatically, but some do require explicit build action to be
added before the run: adding Maven target "<code>install</code>"
should help there.</li>
</ul>
<p><br /></p>
<h2>Other build systems</h2>
<p>We do not ship the build scripts for other build systems, but
there are community-supported bindings to Gradle, sbt, and probably
other builders, see <b>Links</b> section below. If you want to
build with an alternative build system, you may reference the
<a href="//hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-ant-sample/">
Ant sample</a> which describes the steps to build JMH benchmark
projects with Ant.</p>
<p><br /></p>
<h2>Building the "Bleeding Edge" JMH</h2>
<p>In some cases, you want bleeding edge code which contains fixes,
features, and APIs not available yet in released versions. This
section explains how to get the "bleeding edge" JMH in your
project.</p>
<ol>
<li>Check out JMH source with <a href="http://mercurial.selenic.com/">Mercurial</a>:
<blockquote>
<pre>
$ hg clone http://hg.openjdk.java.net/code-tools/jmh/ jmh</pre></blockquote>
</li>
<li>Build JMH. You can optionally skip the tests:
<blockquote>
<pre>$ cd jmh/
$ mvn clean install -DskipTests</pre></blockquote>
<p>You only need to do this step once, and Maven will deploy JMH
into Maven repo on your local machine.</p>
</li>
<li>
<p>If you already have the benchmark project, then it is enough to
change JMH dependencies version to the latest <code>SNAPSHOT</code>
version (look up the actual latest version in <a href="//hg.openjdk.java.net/code-tools/jmh/file/tip/pom.xml#l33">parent
POM</a>). If not, create the JMH benchmark project and change the
version there.</p>
</li>
<li>
<p>Done! Build the benchmark project, and run it:</p>
<blockquote>
<pre>$ mvn clean install
$ java -jar target/benchmarks.jar</pre></blockquote>
</li>
</ol>
<p><br /></p>
<h2>Getting Support</h2>
<p>Make sure you did this before publishing the benchmark, and/or
requesting the JMH feature:</p>
<ul>
<li><b>JMH annotations Javadocs and Samples are essential
reading</b>. Follow the <a href="//hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/">
JMH samples</a> to get familiar with the API, use cases, culprits,
and pitfalls in building the microbenchmarks and using JMH.</li>
<li><b>Your benchmarks should be peer-reviewed.</b> Do not assume
that a nice harness will magically free you from considering
benchmarking pitfalls. We only promise to make avoiding them
easier, not avoiding them completely.</li>
</ul>
<p>Make sure you tried these things before getting support:</p>
<ul>
<li><b>Archetypes provide the golden build configuration.</b> Try
to generate the clean JMH benchmark project and transplant the
benchmark there. This is important to try when upgrading to the
newer JMH versions, since the minute differences in the build
configurations may attribute to the failures you are seeing.</li>
<li><b>Current development code is usually leaner, meaner, and
better.</b> Try to run with bleeding edge JMH to see if the issue
is already fixed.</li>
<li><b>See if your question/issue was discussed already.</b> Look
around mailing list archives to see if there is already an
answer.</li>
</ul>
<p>If all these did not help, you are welcome at the <a href="//mail.openjdk.java.net/mailman/listinfo/jmh-dev">JMH mailing
list</a>.</p>
<p><br /></p>
<h2>Links</h2>
<ul>
<li><a href="//hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/">
JMH Samples</a></li>
<li><a href="//hg.openjdk.java.net/code-tools/jmh/">JMH Source
Repository</a> (includes Changelog)</li>
<li><a href="//mail.openjdk.java.net/mailman/listinfo/jmh-dev">JMH Mailing
List</a></li>
</ul>
<p><br /></p>
<h2>Related projects</h2>
<p>These projects are supported by community, not by OpenJDK/JMH
developers.</p>
<ul>
<li><a href="https://github.com/melix/jmh-gradle-plugin">Gradle JMH
Plugin</a></li>
<li><a href="https://github.com/ktoso/sbt-jmh">Scala SBT JMH
Plugin</a></li>
<li><a href="https://github.com/artyushov/idea-jmh-plugin">IntelliJ
IDEA JMH Plugin</a></li>
<li><a href="https://github.com/brianfromoregon/jmh-plugin">Jenkins
JMH Plugin</a></li>
<li><a href="https://github.com/presidentio/teamcity-plugin-jmh">Teamcity JMH
Plugin</a></li>
</ul>