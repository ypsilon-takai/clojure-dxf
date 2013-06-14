(defproject dxf "1.0.0-SNAPSHOT"
  :description "Clojure DXF library"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.nrepl "0.2.3"]]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.3"]
                                  [org.clojure/java.classpath "0.2.0"]]}}
)
