(ns quicksort.core
  (:gen-class))

(defn qSort [[pivot & rest]]
    (when pivot
        (concat (qSort (filter #(< % pivot) rest))
                (list pivot)
                (qSort (filter #(>= % pivot) rest)))))

; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (println "Hello, World!"))
