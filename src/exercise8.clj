(ns exercise8)

(defn fderive
  [function delta]
  (fn [x] (/ (-(function(+ x delta)) (function x)) delta)))

