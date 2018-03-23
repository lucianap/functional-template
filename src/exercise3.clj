(ns exercise3)


(defn fibonacci
  "Return all values that are greater than five. Recives a list."
  [number]
  (if(= number  0) 0
    (if (= number 1) 1
      (+(fibonacci(- number 1)) (fibonacci(- number 2))))))
