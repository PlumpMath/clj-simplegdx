(defproject clj-simplegdx "0.0.1"
  :description "Playground game in Clojure for libgdx"
  :url "http://github.org/ghubber/clj-simplegdx"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.badlogicgames/gdx "0.9.8"]
                 [com.badlogicgames/gdx-sources "0.9.8"]
                 [com.badlogicgames/gdx-natives "0.9.8"]
                 [com.badlogicgames/gdx-backend-lwjgl "0.9.8"]
                 [com.badlogicgames/gdx-backend-lwjgl-natives "0.9.8"]
                 [com.badlogicgames/gdx-backend-lwjgl-sources "0.9.8"]]
  :repositories {"project" "file:repo"}
  :main clj-simplegdx.core)
