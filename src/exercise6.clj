(ns exercise6)

(defn faverage
  "Return last element of collection"
  [collection]
  (/ (reduce + collection) (reduce 1 collection )))
