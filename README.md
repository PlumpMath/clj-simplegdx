# clj-simplegdx

Example port of [SimpleGame](https://code.google.com/p/libgdx/wiki/SimpleApp) from libgdx to Clojure. Note: You can change the game logic in the small functions live from the REPL! See core.clj for it.

Background music from Francesco Stablum http://www.jamendo.com/de/track/258299/rain under CC-BY-SA. Artwork from OpenClipart.org.

## Usage

Java >= 6 and [Leiningen 2!](http://leiningen.org/) needs to be installed.

You need to fetch a recent version of [libgdx](http://libgdx.badlogicgames.com/).

Unpack into a subfolder and from there add it to your local maven
repository (Maven needs to be installed, tested on Ubuntu 13.04):

Adjust GDX_VERSION and run this snippet in bash in the subfolder:

    export GDX_VERSION="0.9.8"
    for i in "gdx" "gdx-natives" "gdx-backend-lwjgl" "gdx-backend-lwjgl-natives"
    do
    mvn install:install-file -Durl=file:repo -DgroupId=com.badlogicgames -DartifactId=$i -Dversion=$GDX_VERSION -Dpackaging=jar -Dfile=$i.jar -e
    mvn deploy:deploy-file -Durl=file:repo -DgroupId=com.badlogicgames -DartifactId=$i -Dversion=$GDX_VERSION -Dpackaging=jar -Dfile=$i.jar -e
    done

Or this one in Powershell (thanks to Stephan!):

    $GDX_VERSION = "0.9.8"
    $l = @("gdx", "gdx-natives", "gdx-backend-lwjgl", "gdx-backend-lwjgl-natives")
    $l | % {
	mvn install:install-file -Durl=file:repo -DgroupId="com.badlogicgames" -DartifactId="$_" -Dversion="$GDX_VERSION" -Dpackaging=jar -Dfile="$_.jar" -e ;
	mvn deploy:deploy-file -Durl=file:repo -DgroupId="com.badlogicgames" -DartifactId="$_" -Dversion="$GDX_VERSION" -Dpackaging=jar -Dfile="$_.jar" -e
    }


## License

Copyright © 2013 Christian Weilbach

Distributed under the Eclipse Public License, the same as Clojure.
