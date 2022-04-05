addSbtPlugin("org.scalameta"       % "sbt-scalafmt"   % "2.4.6")
addSbtPlugin("pl.project13.scala"  % "sbt-jmh"        % "0.4.3")
addSbtPlugin("com.eed3si9n"        % "sbt-buildinfo"  % "0.11.0")
addSbtPlugin("org.scoverage"       % "sbt-scoverage"  % "1.9.3")
addSbtPlugin("org.scalameta"       % "sbt-mdoc"       % "2.3.0")
addSbtPlugin("ch.epfl.scala"       % "sbt-bloop"      % "1.4.12")
addSbtPlugin("com.github.sbt"      % "sbt-unidoc"     % "0.5.0")
addSbtPlugin("com.github.sbt"      % "sbt-ci-release" % "1.5.10")
addSbtPlugin("com.github.reibitto" % "sbt-welcome"    % "0.2.2")

libraryDependencies += "org.snakeyaml" % "snakeyaml-engine" % "2.3"
