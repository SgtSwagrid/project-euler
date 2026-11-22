import IdeSettings.packagePrefix

scalaVersion := "3.10.1"

scalacOptions ++= Seq(
  "-explain",
  "-explain-types",
  "-explain-cyclic",

  // Enable new experimental features:
  "-language:experimental.subCases",
  "-language:experimental.multiSpreads",
  "-language:experimental.erasedDefinitions",

  // Enable preview features, such as relaxed lambda syntax:
  "-preview",
)

lazy val `project-euler` = project.in(file(".")).settings(
  packagePrefix := "io.github.sgtswagrid.euler",
)
