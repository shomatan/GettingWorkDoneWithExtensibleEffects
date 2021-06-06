name := "GettingWorkDoneWithExtensibleEffects"

version := "0.1"

ThisBuild / scalaVersion := "2.13.6"

val commonSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-java8-compat" % "1.0.0",
    "org.typelevel" %% "cats-core" % "2.6.1",
    "org.typelevel" %% "mouse" % "1.0.3",
    "io.monix" %% "monix-eval" % "3.4.0",
    "org.atnos" %% "eff" % "5.8.1",
    "org.atnos" %% "eff-monix" % "5.8.1",
    "org.atnos" %% "eff-cats-effect" % "5.8.1",
    "com.github.julien-truffaut"  %%  "monocle-core"    % "2.0.4",
    "com.github.julien-truffaut"  %%  "monocle-generic" % "2.0.4",
    "com.github.julien-truffaut"  %%  "monocle-macro"   % "2.0.4",
    "org.specs2" %% "specs2-core" % "4.12.0" % "test"
  ),
  // to write types like Reader[String, ?]
  addCompilerPlugin("org.typelevel" % "kind-projector_2.13.4" % "0.13.0"),
  //to allow tuple extraction and type ascription in for expressions
  addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
  Test / scalacOptions += "-Yrangepos"
)



lazy val exerciseClassic = (project in file("exerciseClassic")).settings(commonSettings)

lazy val exerciseTask = (project in file("exerciseTask")).settings(commonSettings)

lazy val exerciseReader = (project in file("exerciseReader")).settings(commonSettings)

lazy val exerciseError = (project in file("exerciseError")).settings(commonSettings)

lazy val exerciseWriter = (project in file("exerciseWriter")).settings(commonSettings)

lazy val exerciseConcurrent = (project in file("exerciseConcurrent")).settings(commonSettings)

lazy val exerciseState = (project in file("exerciseState")).settings(commonSettings)

lazy val exerciseOptics = (project in file("exerciseOptics")).settings(commonSettings)

lazy val exerciseCustom = (project in file("exerciseCustom")).settings(commonSettings)



lazy val solutionExerciseClassic = (project in file("solutions/exerciseClassic")).settings(commonSettings)

lazy val solutionExerciseTask = (project in file("solutions/exerciseTask")).settings(commonSettings)

lazy val solutionExerciseReader = (project in file("solutions/exerciseReader")).settings(commonSettings)

lazy val solutionExerciseError = (project in file("solutions/exerciseError")).settings(commonSettings)

lazy val solutionExerciseWriter = (project in file("solutions/exerciseWriter")).settings(commonSettings)

lazy val solutionExerciseConcurrent = (project in file("solutions/exerciseConcurrent")).settings(commonSettings)

lazy val solutionExerciseState = (project in file("solutions/exerciseState")).settings(commonSettings)

lazy val solutionExerciseOptics = (project in file("solutions/exerciseOptics")).settings(commonSettings)

lazy val solutionExerciseCustom = (project in file("solutions/exerciseCustom")).settings(commonSettings)


lazy val exercise1 = (project in file("exercise1")).settings(commonSettings)

lazy val exercise2 = (project in file("exercise2")).settings(commonSettings)

lazy val exercise3 = (project in file("exercise3")).settings(commonSettings)

lazy val exercise4 = (project in file("exercise4")).settings(commonSettings)

lazy val exercise5 = (project in file("exercise5")).settings(commonSettings)

lazy val solutionExercise1 = (project in file("solutions/exercise1")).settings(commonSettings)

lazy val solutionExercise2 = (project in file("solutions/exercise2")).settings(commonSettings)

lazy val solutionExercise2io = (project in file("solutions/exercise2io")).settings(commonSettings)

lazy val solutionExercise3 = (project in file("solutions/exercise3")).settings(commonSettings)

lazy val solutionExercise4 = (project in file("solutions/exercise4")).settings(commonSettings)

lazy val solutionExercise5 = (project in file("solutions/exercise5")).settings(commonSettings)

val testSolutions = TaskKey[Unit]("testSolutions", "Run all solution tests")
testSolutions := Seq(
  solutionExerciseClassic / Test / test,
  solutionExerciseTask / Test / test,
  solutionExerciseReader / Test / test,
  solutionExerciseError / Test / test,
  solutionExerciseWriter / Test / test,
  solutionExerciseState / Test / test,
  solutionExerciseConcurrent / Test / test,
  solutionExerciseOptics / Test / test,
  solutionExerciseCustom / Test / test,
).dependOn.value

