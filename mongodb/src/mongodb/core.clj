(ns mongodb.core
  (:gen-class)
  (:require [monger.core :as mg]
            [monger.collection :as mc]))

(let [conn (mg/connect)
      db   (mg/get-db conn "monger-test")
      coll "documents"]
  ; (mc/insert db coll {:first_name "John"  :last_name "Lennon"})
  ; (mc/insert db coll {:first_name "Ringo" :last_name "Starr"})
  (println "--------------------------------------------------------------------------------")
  (println (mc/count db coll { :last_name "Lennon"})))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
