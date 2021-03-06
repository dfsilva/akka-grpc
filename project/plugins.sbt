addSbtPlugin("com.geirsson"      % "sbt-scalafmt" % "0.4.10")
addSbtPlugin("com.thesamet"      % "sbt-protoc"   % "0.99.3")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.8.5")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "1.6.0")
addSbtPlugin("io.spray"          % "sbt-revolver" % "0.8.0")

libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.5.46"
