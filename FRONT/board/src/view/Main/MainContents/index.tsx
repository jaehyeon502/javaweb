import { useEffect, useState } from "react";

import { Box, Grid, Pagination, Typography, Stack } from "@mui/material";

import BoardListItem from "src/components/BoardListItem";
import PopularCard from "src/components/PopularCard";
import { IPreviewItem } from "src/interface";
import { BOARD_LIST } from "src/mock";
import { getPageCount } from "src/utils";
import { usePagingHook } from "src/hooks";

export default function MainContents() {

  const {viewList, pageNumber, boardList, setBoardList, onPageHandler, COUNT  } = usePagingHook(5);

  useEffect(() => {
    setBoardList(BOARD_LIST);
  }, [])

    //? 한 페이지에 5개의 게시물을 보여주고자 할 때
    //? 배열의 시작 인덱스   5 * pageNumber -5 -> 5 * (pageNumber - 1)
    //? 배열의 마지막 인덱스 5 * pageNumber -1

  return (
    <Box sx={{ p: "40px 120px", backgroundColor: "rgba(0, 0, 0, 0.05)" }}>
      <Box>
        <Typography sx={{ fontSize: "24px", fontWeight: "500" }}>
          최신 게시물
        </Typography>
      </Box>
      <Box sx={{ pt: "20px", pb: "80px" }}>
        <Grid container spacing={3}>
          <Grid item sm={12} md={8}>
            <Stack spacing={2}>
              {viewList.map((boardItem) => (
                <BoardListItem item={boardItem as IPreviewItem} />
              ))}
            </Stack>
          </Grid>
          <Grid item sm={12} md={4}>
            <PopularCard title="인기 검색어" />
          </Grid>
        </Grid>
      </Box>
      <Box sx={{ display: "flex", justifyContent: "center" }}>
        <Pagination
          page={pageNumber}
          count={getPageCount(boardList, COUNT)}
          onChange={(event, value) => onPageHandler(value)}
        />
      </Box>
    </Box>
  );
}
