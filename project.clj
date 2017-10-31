(defproject compass "0.1.0-SNAPSHOT"
  :description "A clojure compass for OrientDB"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta3"]

                ;; To test how the postgresql database abstraction works
               [com.layerware/hugsql "0.4.8"]
               [org.postgresql/postgresql "42.1.4"]
  
             ;; to simplify the Data Structure traversals
  				   ;[com.rpl/specter "1.0.4"][medley "1.0.0"]
             [com.orientechnologies/orientdb-core "2.2.29"] ]
  :main ^:skip-aot compass.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
