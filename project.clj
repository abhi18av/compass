(defproject compass "0.1.0-SNAPSHOT"
  :description "A clojure compass for OrientDB"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta4"]

;; Utility
  				[im.chit/hara "2.5.10"]
				[im.chit/lucid "1.3.13"]
				[com.rpl/specter "1.0.4"]
				[prismatic/plumbing "0.5.4"] 


                 ;; for logging issue related to neo4j
                 [com.fzakaria/slf4j-timbre "0.3.7"]

                 ;; Shell library
                 [me.raynes/conch "0.8.0"]


;; RELATIONAL 
                ;; To test how the postgresql database abstraction works
               [com.layerware/hugsql "0.4.8"]
               [org.postgresql/postgresql "42.1.4"]
 
;; KEY-VALUE
[com.taoensso/carmine "2.16.0"]

;; SEARCH

[clojurewerkz/elastisch "3.0.0-beta2"]
;; DOCUMENT
[com.novemberain/monger "3.1.0"]

;; GRAPH
[clojurewerkz/neocons "3.1.0"]


             ;; to simplify the Data Structure traversals
  				   ;[com.rpl/specter "1.0.4"][medley "1.0.0"]
             [com.orientechnologies/orientdb-core "2.2.29"] ]
  :main ^:skip-aot compass.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
