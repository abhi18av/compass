(defproject compass "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta3"]
				[com.orientechnologies/orientdb-core "2.2.29"]
				[com.rpl/specter "1.0.4"]
				[medley "1.0.0"]]
  :main ^:skip-aot compass.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
