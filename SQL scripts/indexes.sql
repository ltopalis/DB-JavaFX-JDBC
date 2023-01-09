CREATE INDEX index_reservation_offers_by_price
USING BTREE
ON reservation_offers (res_off_depoit)
ALGORITHM = DEFAULT;