-- 20/04/2020 16:47:36 ART
-- ISSUE #80: Cierre de Cajas.
UPDATE AD_Column SET IsAllowCopy='N',Updated=TO_TIMESTAMP('2020-04-20 16:47:36','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=12925
;

-- 20/04/2020 16:47:43 ART
-- ISSUE #80: Cierre de Cajas.
UPDATE AD_Column SET IsAllowCopy='N',Updated=TO_TIMESTAMP('2020-04-20 16:47:43','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=5355
;

-- 22/04/2020 18:37:08 ART
-- ISSUE #80: Cierre de Cajas.
UPDATE AD_Column SET IsAllowCopy='N',Updated=TO_TIMESTAMP('2020-04-22 18:37:08','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=5496
;

-- Registración de script
SELECT register_migration_script_lar('0152_ISSUE-80.sql', 'LAR', '')
;
