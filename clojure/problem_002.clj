#!/usr/bin/env java -cp /Library/Clojure/lib/clojure.jar:. clojure.main
(defn less-than-four-million?
      [n]
      (< n 4000000)
)

(defn fib 
    ([] 
        (concat [0 1] (fib 0 1))
    ) 
    ([a b] 
        (let [n (+ a b)] 
            (lazy-seq 
                (cons n (fib b n))
            )
        )
    )
)

(println
  (reduce +
    (filter even?
      (take-while less-than-four-million? (fib))
    )
  )
)

;; A naive version of Fibonacci
;; (defn fib [n] 
;;     (if (= n 0) 0
;;         (if (= n 1) 1
;;             (+ (fib (- n 1)) (fib (- n 2)))
;;         )
;;     )
;; ) 
