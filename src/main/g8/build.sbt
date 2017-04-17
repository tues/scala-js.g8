lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization := "$organization$",
      version      := "$version$",
      scalaVersion := "$scala_version$"
    )),
    name := "$name$",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "$scalajs_dom_version$"
    ),
    scalaJSUseMainModuleInitializer := true
  )
