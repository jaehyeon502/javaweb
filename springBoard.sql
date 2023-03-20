SELECT search_word, count(search_word) AS count
FROM searchwordlog 
GROUP BY search_word 
ORDER BY count DESC
LIMIT 15;

SELECT search_word, previous_search_word, count(search_word) AS count
FROM relatedsearchword
WHERE search_word = '안녕'
GROUP BY previous_search_word, search_word
ORDER BY count DESC;