(ns exercise6)

(defn faverage
  "Return the average of the collection"
  [collection]
  (/ (reduce + collection) (reduce 1 collection )))
