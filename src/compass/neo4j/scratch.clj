(ns compass.neo4j.scratch
  (:require [clojurewerkz.neocons.rest :as nr]
            [compass.passwords]
            [clojurewerkz.neocons.rest.nodes :as nn]
            [clojurewerkz.neocons.rest.relationships :as nrl]))

(def credentials
  (str
   (compass.passwords/neo4j-credentials :username)
   ":"
   (compass.passwords/neo4j-credentials :password)
   "@"))

(def url
  (str "http://" credentials "localhost:7474/db/data/"))


(let [conn  (nr/connect url)
      neo4j   (nn/create conn {:username "neo4j"})
      page1 (nn/create conn {:url "http://clojurewerkz.org"})
      page2 (nn/create conn {:url "http://clojureneo4j.info"})
      ;; a relationship that indicates that page1 links to page2
      rel   (nrl/create conn page1 page2 :links)]
  (println (nn/get conn (:id neo4j))))
