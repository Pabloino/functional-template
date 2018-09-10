(ns exercise3)

(defn fibonacci
  [numero]
  (cond 
    (= numero 0) 0
    (= numero 1) 1
    :else (+ (fibonacci (dec numero)) (fibonacci (- numero 2)))
  )
)
