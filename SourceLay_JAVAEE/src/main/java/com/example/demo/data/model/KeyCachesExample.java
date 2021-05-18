package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class KeyCachesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeyCachesExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKeyCacheNameIsNull() {
            addCriterion("KEY_CACHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameIsNotNull() {
            addCriterion("KEY_CACHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameEqualTo(String value) {
            addCriterion("KEY_CACHE_NAME =", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameNotEqualTo(String value) {
            addCriterion("KEY_CACHE_NAME <>", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameGreaterThan(String value) {
            addCriterion("KEY_CACHE_NAME >", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_CACHE_NAME >=", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameLessThan(String value) {
            addCriterion("KEY_CACHE_NAME <", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameLessThanOrEqualTo(String value) {
            addCriterion("KEY_CACHE_NAME <=", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameLike(String value) {
            addCriterion("KEY_CACHE_NAME like", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameNotLike(String value) {
            addCriterion("KEY_CACHE_NAME not like", value, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameIn(List<String> values) {
            addCriterion("KEY_CACHE_NAME in", values, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameNotIn(List<String> values) {
            addCriterion("KEY_CACHE_NAME not in", values, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameBetween(String value1, String value2) {
            addCriterion("KEY_CACHE_NAME between", value1, value2, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andKeyCacheNameNotBetween(String value1, String value2) {
            addCriterion("KEY_CACHE_NAME not between", value1, value2, "keyCacheName");
            return (Criteria) this;
        }

        public Criteria andSegmentsIsNull() {
            addCriterion("SEGMENTS is null");
            return (Criteria) this;
        }

        public Criteria andSegmentsIsNotNull() {
            addCriterion("SEGMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentsEqualTo(Integer value) {
            addCriterion("SEGMENTS =", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotEqualTo(Integer value) {
            addCriterion("SEGMENTS <>", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsGreaterThan(Integer value) {
            addCriterion("SEGMENTS >", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEGMENTS >=", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsLessThan(Integer value) {
            addCriterion("SEGMENTS <", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsLessThanOrEqualTo(Integer value) {
            addCriterion("SEGMENTS <=", value, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsIn(List<Integer> values) {
            addCriterion("SEGMENTS in", values, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotIn(List<Integer> values) {
            addCriterion("SEGMENTS not in", values, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENTS between", value1, value2, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentsNotBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENTS not between", value1, value2, "segments");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberIsNull() {
            addCriterion("SEGMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberIsNotNull() {
            addCriterion("SEGMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberEqualTo(Integer value) {
            addCriterion("SEGMENT_NUMBER =", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberNotEqualTo(Integer value) {
            addCriterion("SEGMENT_NUMBER <>", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberGreaterThan(Integer value) {
            addCriterion("SEGMENT_NUMBER >", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEGMENT_NUMBER >=", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberLessThan(Integer value) {
            addCriterion("SEGMENT_NUMBER <", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("SEGMENT_NUMBER <=", value, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberIn(List<Integer> values) {
            addCriterion("SEGMENT_NUMBER in", values, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberNotIn(List<Integer> values) {
            addCriterion("SEGMENT_NUMBER not in", values, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENT_NUMBER between", value1, value2, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andSegmentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("SEGMENT_NUMBER not between", value1, value2, "segmentNumber");
            return (Criteria) this;
        }

        public Criteria andFullSizeIsNull() {
            addCriterion("FULL_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFullSizeIsNotNull() {
            addCriterion("FULL_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFullSizeEqualTo(Long value) {
            addCriterion("FULL_SIZE =", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeNotEqualTo(Long value) {
            addCriterion("FULL_SIZE <>", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeGreaterThan(Long value) {
            addCriterion("FULL_SIZE >", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("FULL_SIZE >=", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeLessThan(Long value) {
            addCriterion("FULL_SIZE <", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeLessThanOrEqualTo(Long value) {
            addCriterion("FULL_SIZE <=", value, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeIn(List<Long> values) {
            addCriterion("FULL_SIZE in", values, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeNotIn(List<Long> values) {
            addCriterion("FULL_SIZE not in", values, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeBetween(Long value1, Long value2) {
            addCriterion("FULL_SIZE between", value1, value2, "fullSize");
            return (Criteria) this;
        }

        public Criteria andFullSizeNotBetween(Long value1, Long value2) {
            addCriterion("FULL_SIZE not between", value1, value2, "fullSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeIsNull() {
            addCriterion("BLOCK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andBlockSizeIsNotNull() {
            addCriterion("BLOCK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andBlockSizeEqualTo(Long value) {
            addCriterion("BLOCK_SIZE =", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeNotEqualTo(Long value) {
            addCriterion("BLOCK_SIZE <>", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeGreaterThan(Long value) {
            addCriterion("BLOCK_SIZE >", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOCK_SIZE >=", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeLessThan(Long value) {
            addCriterion("BLOCK_SIZE <", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeLessThanOrEqualTo(Long value) {
            addCriterion("BLOCK_SIZE <=", value, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeIn(List<Long> values) {
            addCriterion("BLOCK_SIZE in", values, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeNotIn(List<Long> values) {
            addCriterion("BLOCK_SIZE not in", values, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeBetween(Long value1, Long value2) {
            addCriterion("BLOCK_SIZE between", value1, value2, "blockSize");
            return (Criteria) this;
        }

        public Criteria andBlockSizeNotBetween(Long value1, Long value2) {
            addCriterion("BLOCK_SIZE not between", value1, value2, "blockSize");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksIsNull() {
            addCriterion("USED_BLOCKS is null");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksIsNotNull() {
            addCriterion("USED_BLOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksEqualTo(Long value) {
            addCriterion("USED_BLOCKS =", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksNotEqualTo(Long value) {
            addCriterion("USED_BLOCKS <>", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksGreaterThan(Long value) {
            addCriterion("USED_BLOCKS >", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksGreaterThanOrEqualTo(Long value) {
            addCriterion("USED_BLOCKS >=", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksLessThan(Long value) {
            addCriterion("USED_BLOCKS <", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksLessThanOrEqualTo(Long value) {
            addCriterion("USED_BLOCKS <=", value, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksIn(List<Long> values) {
            addCriterion("USED_BLOCKS in", values, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksNotIn(List<Long> values) {
            addCriterion("USED_BLOCKS not in", values, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksBetween(Long value1, Long value2) {
            addCriterion("USED_BLOCKS between", value1, value2, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUsedBlocksNotBetween(Long value1, Long value2) {
            addCriterion("USED_BLOCKS not between", value1, value2, "usedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksIsNull() {
            addCriterion("UNUSED_BLOCKS is null");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksIsNotNull() {
            addCriterion("UNUSED_BLOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksEqualTo(Long value) {
            addCriterion("UNUSED_BLOCKS =", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksNotEqualTo(Long value) {
            addCriterion("UNUSED_BLOCKS <>", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksGreaterThan(Long value) {
            addCriterion("UNUSED_BLOCKS >", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksGreaterThanOrEqualTo(Long value) {
            addCriterion("UNUSED_BLOCKS >=", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksLessThan(Long value) {
            addCriterion("UNUSED_BLOCKS <", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksLessThanOrEqualTo(Long value) {
            addCriterion("UNUSED_BLOCKS <=", value, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksIn(List<Long> values) {
            addCriterion("UNUSED_BLOCKS in", values, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksNotIn(List<Long> values) {
            addCriterion("UNUSED_BLOCKS not in", values, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksBetween(Long value1, Long value2) {
            addCriterion("UNUSED_BLOCKS between", value1, value2, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andUnusedBlocksNotBetween(Long value1, Long value2) {
            addCriterion("UNUSED_BLOCKS not between", value1, value2, "unusedBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksIsNull() {
            addCriterion("DIRTY_BLOCKS is null");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksIsNotNull() {
            addCriterion("DIRTY_BLOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksEqualTo(Long value) {
            addCriterion("DIRTY_BLOCKS =", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksNotEqualTo(Long value) {
            addCriterion("DIRTY_BLOCKS <>", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksGreaterThan(Long value) {
            addCriterion("DIRTY_BLOCKS >", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksGreaterThanOrEqualTo(Long value) {
            addCriterion("DIRTY_BLOCKS >=", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksLessThan(Long value) {
            addCriterion("DIRTY_BLOCKS <", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksLessThanOrEqualTo(Long value) {
            addCriterion("DIRTY_BLOCKS <=", value, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksIn(List<Long> values) {
            addCriterion("DIRTY_BLOCKS in", values, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksNotIn(List<Long> values) {
            addCriterion("DIRTY_BLOCKS not in", values, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksBetween(Long value1, Long value2) {
            addCriterion("DIRTY_BLOCKS between", value1, value2, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andDirtyBlocksNotBetween(Long value1, Long value2) {
            addCriterion("DIRTY_BLOCKS not between", value1, value2, "dirtyBlocks");
            return (Criteria) this;
        }

        public Criteria andReadRequestsIsNull() {
            addCriterion("READ_REQUESTS is null");
            return (Criteria) this;
        }

        public Criteria andReadRequestsIsNotNull() {
            addCriterion("READ_REQUESTS is not null");
            return (Criteria) this;
        }

        public Criteria andReadRequestsEqualTo(Long value) {
            addCriterion("READ_REQUESTS =", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsNotEqualTo(Long value) {
            addCriterion("READ_REQUESTS <>", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsGreaterThan(Long value) {
            addCriterion("READ_REQUESTS >", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsGreaterThanOrEqualTo(Long value) {
            addCriterion("READ_REQUESTS >=", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsLessThan(Long value) {
            addCriterion("READ_REQUESTS <", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsLessThanOrEqualTo(Long value) {
            addCriterion("READ_REQUESTS <=", value, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsIn(List<Long> values) {
            addCriterion("READ_REQUESTS in", values, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsNotIn(List<Long> values) {
            addCriterion("READ_REQUESTS not in", values, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsBetween(Long value1, Long value2) {
            addCriterion("READ_REQUESTS between", value1, value2, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadRequestsNotBetween(Long value1, Long value2) {
            addCriterion("READ_REQUESTS not between", value1, value2, "readRequests");
            return (Criteria) this;
        }

        public Criteria andReadsIsNull() {
            addCriterion("READS is null");
            return (Criteria) this;
        }

        public Criteria andReadsIsNotNull() {
            addCriterion("READS is not null");
            return (Criteria) this;
        }

        public Criteria andReadsEqualTo(Long value) {
            addCriterion("READS =", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotEqualTo(Long value) {
            addCriterion("READS <>", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsGreaterThan(Long value) {
            addCriterion("READS >", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsGreaterThanOrEqualTo(Long value) {
            addCriterion("READS >=", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsLessThan(Long value) {
            addCriterion("READS <", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsLessThanOrEqualTo(Long value) {
            addCriterion("READS <=", value, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsIn(List<Long> values) {
            addCriterion("READS in", values, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotIn(List<Long> values) {
            addCriterion("READS not in", values, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsBetween(Long value1, Long value2) {
            addCriterion("READS between", value1, value2, "reads");
            return (Criteria) this;
        }

        public Criteria andReadsNotBetween(Long value1, Long value2) {
            addCriterion("READS not between", value1, value2, "reads");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsIsNull() {
            addCriterion("WRITE_REQUESTS is null");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsIsNotNull() {
            addCriterion("WRITE_REQUESTS is not null");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsEqualTo(Long value) {
            addCriterion("WRITE_REQUESTS =", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsNotEqualTo(Long value) {
            addCriterion("WRITE_REQUESTS <>", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsGreaterThan(Long value) {
            addCriterion("WRITE_REQUESTS >", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITE_REQUESTS >=", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsLessThan(Long value) {
            addCriterion("WRITE_REQUESTS <", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsLessThanOrEqualTo(Long value) {
            addCriterion("WRITE_REQUESTS <=", value, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsIn(List<Long> values) {
            addCriterion("WRITE_REQUESTS in", values, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsNotIn(List<Long> values) {
            addCriterion("WRITE_REQUESTS not in", values, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsBetween(Long value1, Long value2) {
            addCriterion("WRITE_REQUESTS between", value1, value2, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWriteRequestsNotBetween(Long value1, Long value2) {
            addCriterion("WRITE_REQUESTS not between", value1, value2, "writeRequests");
            return (Criteria) this;
        }

        public Criteria andWritesIsNull() {
            addCriterion("WRITES is null");
            return (Criteria) this;
        }

        public Criteria andWritesIsNotNull() {
            addCriterion("WRITES is not null");
            return (Criteria) this;
        }

        public Criteria andWritesEqualTo(Long value) {
            addCriterion("WRITES =", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotEqualTo(Long value) {
            addCriterion("WRITES <>", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesGreaterThan(Long value) {
            addCriterion("WRITES >", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITES >=", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesLessThan(Long value) {
            addCriterion("WRITES <", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesLessThanOrEqualTo(Long value) {
            addCriterion("WRITES <=", value, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesIn(List<Long> values) {
            addCriterion("WRITES in", values, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotIn(List<Long> values) {
            addCriterion("WRITES not in", values, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesBetween(Long value1, Long value2) {
            addCriterion("WRITES between", value1, value2, "writes");
            return (Criteria) this;
        }

        public Criteria andWritesNotBetween(Long value1, Long value2) {
            addCriterion("WRITES not between", value1, value2, "writes");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}