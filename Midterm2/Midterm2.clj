;; Gayanath Sasitharanathan 
;; 100490365

(defn rev [xs]
	(n == count xs)
	(if (empty? xs)
		{values}
		(let [head (first xs)
		      tail (rest xs)]
		(rev (+ (list n-1)(list 0))))



(def rev (fn [xs]
	(n == count xs)
	(if (empty? xs)
		{values}
		(let [head (first xs)
		      tail (rest xs)]
		(rev (+ (list n-1)(list 0))))

	















;; 4) The output of this program is 2 and 3
;; 5) The symbols and bindings in the scope of line 3 are x is the variable that is binded to the the function x (inc 1) y 0
;; 6) In the scope of line 5 the variable x is binded to x(inc x) which is binded to x(inc x) y 0 ]

(defn avg [xs]
(loop [n 0
	tot 0 
	xs xs]
(if (empty? xs)
(/tot n)
(let [x (first xs)
	xs (rest xs)]
(recur (inc n)(+ tot x) xs)))))


(loop [xs xs]
	(if (empty? xs)	
		{}
	(apply + xs)))


