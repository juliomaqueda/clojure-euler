(defproject clojure-euler "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cloverage "1.0.10"]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
