SELECT 'Upgrading MetaStore schema from 1.2.1000 to 2.0.0' AS MESSAGE;

-- SOURCE 021-HIVE-7018.mysql.sql;
SELECT '< HIVE-7018 Remove Table and Partition tables column LINK_TARGET_ID from Mysql for other DBs do not have it >' AS MESSAGE;

-- SOURCE 022-HIVE-11970.mysql.sql;
ALTER TABLE `COLUMNS_V2` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL;
ALTER TABLE `PART_COL_PRIVS` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL;
ALTER TABLE `TBL_COL_PRIVS` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL;
ALTER TABLE `SORT_COLS` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL;
ALTER TABLE `TAB_COL_STATS` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL;
ALTER TABLE `PART_COL_STATS` MODIFY `COLUMN_NAME` varchar(767) CHARACTER SET latin1 COLLATE latin1_bin NOT NULL;

UPDATE VERSION SET SCHEMA_VERSION='2.0.0', VERSION_COMMENT='Hive release version 2.0.0' where VER_ID=1;
SELECT 'Finished upgrading MetaStore schema from 1.2.1000 to 2.0.0' AS MESSAGE;