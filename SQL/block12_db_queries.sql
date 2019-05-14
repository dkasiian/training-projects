-- №1
SELECT 
(SELECT COUNT(n_id) FROM news) + 
(SELECT COUNT(r_id) FROM reviews) 
AS SUM

-- №2
SELECT news_categories.nc_name, COUNT(news.n_category) AS Total
FROM news_categories
LEFT JOIN news ON news_categories.nc_id = news.n_category
GROUP BY news_categories.nc_name;

-- №3
SELECT reviews_categories.rc_name, COUNT(reviews.r_category) AS Total
FROM reviews_categories
LEFT JOIN reviews ON reviews_categories.rc_id = reviews.r_category
GROUP BY reviews_categories.rc_name;

-- №4
SELECT news_categories.nc_name AS category_name, last_date
FROM news_categories
LEFT JOIN news ON news_categories.nc_id = news.n_category
INNER JOIN
    (SELECT n_category, MAX(n_dt) AS last_date
    FROM news
    GROUP BY n_category) grouped 
ON news.n_dt = grouped.last_date
UNION SELECT reviews_categories.rc_name AS category_name, last_date
FROM reviews_categories
LEFT JOIN reviews ON reviews_categories.rc_id = reviews.r_category
INNER JOIN
    (SELECT r_category, MAX(r_dt) AS last_date
    FROM reviews
    GROUP BY r_category) grouped 
ON reviews.r_dt = grouped.last_date;

-- №5
SELECT pages.p_name, m2m_banners_pages.b_id, banners.b_url
FROM pages, m2m_banners_pages, banners
WHERE banners.b_id = m2m_banners_pages.b_id AND pages.p_id = m2m_banners_pages.p_id AND pages.p_parent IS NULL;

-- №6
SELECT pages.p_name
FROM pages, m2m_banners_pages
WHERE m2m_banners_pages.p_id = pages.p_id
GROUP BY pages.p_name;

-- №7
SELECT pages.p_name
FROM pages
WHERE pages.p_id NOT IN (SELECT m2m_banners_pages.p_id FROM m2m_banners_pages);

-- №8
SELECT banners.b_id, banners.b_url
FROM banners, m2m_banners_pages
WHERE m2m_banners_pages.b_id = banners.b_id
GROUP BY banners.b_id;

-- №9
SELECT banners.b_id, banners.b_url
FROM banners, m2m_banners_pages
WHERE banners.b_id NOT IN (SELECT m2m_banners_pages.b_id FROM m2m_banners_pages)
GROUP BY banners.b_id;

-- №10
SELECT banners.b_id, banners.b_url, (banners.b_click / banners.b_show * 100) AS rate
FROM banners
WHERE banners.b_show > 0 AND (banners.b_click / banners.b_show) * 100 >= 80;

-- №11
SELECT pages.p_name
FROM pages, m2m_banners_pages, banners
WHERE m2m_banners_pages.b_id = banners.b_id AND m2m_banners_pages.p_id = pages.p_id AND banners.b_text IS NOT NULL
GROUP BY pages.p_name;

-- №12
SELECT pages.p_name
FROM pages, banners, m2m_banners_pages
WHERE m2m_banners_pages.b_id = banners.b_id AND m2m_banners_pages.p_id = pages.p_id AND banners.b_pic IS NOT NULL
GROUP BY pages.p_name;

-- №13
SELECT news.n_header AS header, news.n_dt AS date
FROM news
WHERE YEAR(news.n_dt) = 2011
UNION SELECT reviews.r_header AS header, reviews.r_dt AS date
FROM reviews
WHERE YEAR(reviews.r_dt) = 2011;

-- №14
SELECT nc.nc_name AS category
FROM news_categories AS nc, news
WHERE nc.nc_id NOT IN (SELECT news.n_category FROM news)
UNION SELECT rc.rc_name AS category
FROM reviews_categories AS rc, reviews
WHERE rc.rc_id NOT IN (SELECT reviews.r_category FROM reviews);

-- №15
SELECT news.n_header, news.n_dt
FROM news
WHERE news.n_category = 3 AND YEAR(news.n_dt) = 2012;

-- №16
SELECT YEAR(news.n_dt) AS year, COUNT(*)
FROM news 
GROUP BY YEAR(news.n_dt);

-- №17
SELECT banners.b_url, banners.b_id
FROM banners
JOIN (SELECT banners.b_url FROM banners GROUP BY banners.b_url HAVING COUNT(*) > 1) AS b
ON banners.b_url = b.b_url;

-- №18
SELECT pages.p_name, banners.b_id, banners.b_url
FROM pages 
JOIN m2m_banners_pages ON pages.p_id = m2m_banners_pages.p_id
JOIN banners ON m2m_banners_pages.b_id = banners.b_id
WHERE pages.p_parent = (SELECT pages.p_id FROM pages WHERE p_name ='Юридическим лицам');

-- №19
SELECT banners.b_id, banners.b_url, (banners.b_click / banners.b_show) AS rate
FROM banners
WHERE banners.b_pic IS NOT NULL
ORDER BY rate DESC;

-- №20
SELECT news.n_header AS header, news.n_dt AS date
FROM news, reviews
WHERE news.n_dt = (SELECT MIN(news.n_dt) FROM news)
UNION SELECT reviews.r_header AS header, reviews.r_dt AS date
FROM reviews
WHERE reviews.r_dt = (SELECT MIN(reviews.r_dt) FROM reviews)
ORDER BY date
LIMIT 1;

-- №21
SELECT banners.b_id, banners.b_url 
FROM banners
GROUP BY banners.b_url
HAVING COUNT(*) = 1;

-- №22
SELECT pages.p_name, COUNT(m2m_banners_pages.b_id) as banners_count
FROM pages, m2m_banners_pages
WHERE pages.p_id = m2m_banners_pages.p_id
GROUP BY m2m_banners_pages.p_id
ORDER BY banners_count DESC, pages.p_name;

-- №23
SELECT news.n_header AS header, news.n_dt AS date
FROM news, reviews
WHERE news.n_dt = (SELECT MAX(news.n_dt) FROM news)
UNION SELECT reviews.r_header AS header, reviews.r_dt AS date
FROM reviews
WHERE reviews.r_dt = (SELECT MAX(reviews.r_dt) FROM reviews);

-- №24
SELECT banners.b_id, banners.b_url, banners.b_text
FROM banners
WHERE SUBSTRING(banners.b_url, 8) LIKE LOWER(banners.b_text);

-- №25 !!!!!!!!!
SELECT banners.b_id
FROM banners
WHERE banners.b_click / banners.b_show = (SELECT MAX(banners.b_click / banners.b_show) FROM banners);

-- №26
SELECT AVG(banners.b_click / banners.b_show)
FROM banners, m2m_banners_pages
WHERE banners.b_show > 0;

-- №27
SELECT AVG(banners.b_click / banners.b_show)
FROM banners
WHERE banners.b_pic IS NULL;

-- №28
SELECT COUNT(*) AS COUNT
FROM m2m_banners_pages
WHERE m2m_banners_pages.p_id IN (SELECT pages.p_id FROM pages WHERE pages.p_parent IS NULL);

-- №29
SELECT m2m_banners_pages.b_id, banners.b_url, COUNT(m2m_banners_pages.p_id) AS COUNT
FROM m2m_banners_pages, banners
WHERE banners.b_id = m2m_banners_pages.b_id
GROUP BY m2m_banners_pages.b_id
HAVING COUNT(m2m_banners_pages.p_id) = 
(SELECT MAX(counted) FROM
	(SELECT COUNT(*) AS counted
	 FROM m2m_banners_pages
	 GROUP BY m2m_banners_pages.b_id) AS COUNTS
);

-- №30
SELECT pages.p_name, COUNT(m2m_banners_pages.b_id) AS COUNTS
FROM pages, m2m_banners_pages
WHERE pages.p_id = m2m_banners_pages.p_id 
GROUP BY m2m_banners_pages.p_id 
HAVING COUNT(m2m_banners_pages.b_id) = 
(SELECT MAX(counted) FROM 
(
	SELECT COUNT(*) AS counted 
    FROM m2m_banners_pages 
    GROUP BY m2m_banners_pages.p_id
) AS COUNTS);












