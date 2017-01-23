(ns tutorial.got
  (use clojure.java.io)
  (use [clojure.string :only (split)]))
    
(defn -main [filename]
  (with-open [r (reader filename)]
    (let [ls (line-seq r)
          headers (split (first ls) #",")
          values (map #(zipmap headers %) (map #(split % #",") (rest ls)))]
      (doseq [h headers
              :let [value_sets (set (map #(get % h) values))]]
        (println h 
                 "- count:" (count value_sets) 
                 (if-not (or (= h "Name") (= h "Allegiances"))
                   (let [int_values (map #(Integer/parseInt %) (filter #(> (count %) 0) value_sets))]
                     (str "- min:" (apply min int_values)
                          "- max:" (apply max int_values)))))))))


			