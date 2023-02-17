import { useEffect, useState } from "react";

import { Box, Typography, Grid, Pagination, Stack } from "@mui/material";
import PopularCard from "src/components/PopularCard";
import { useParams } from "react-router-dom";
import { IPreviewItem } from "src/interface";
import { BOARD_LIST } from "src/mock";

export default function SearchView() {

    const [ boardList, setBoardList ] = useState<IPreviewItem[]>([]);
    const { content } = useParams();

    useEffect(() => {
        //# array.filter(요소 => 조건)
        //? 특정한 조건에 부합하는 요소만 모아서 새로운 배열로 만들어 반환하는 메서드
        //# string.inclues(검색할 문자열)
        //? 해당 문자열에서 검색할 문자열이 존재한다면 true, 아니면 false를 반환하는 메서드
        const tmp = BOARD_LIST.filter((board) => board.boardTitle.includes(content as string));
        setBoardList(tmp);
    }, [])

  return (

    <Box sx={{ p:'40px 120px', backgroundColor: 'rgba(0,0,0,0.05)' }}>
      <Box sx={{ fontSize:'24px', fontWeight:'500' }}>
        <Box component="strong" sx={{ opacity:'1' }}>{content}</Box>
        <Typography component="span" sx={{ fontSize:'24px', fontWeight:'500', opacity:'0.7' }} >에 대한 검색결과 입니다. </Typography>
        <Box component="strong" sx={{ opacity:'1' }}>12</Box>
      </Box>
      <Box sx={{ pt:'20px', pb:'80px' }}>
        <Grid container spacing={3} >
            <Grid item xs={12} md={8}>
                <Stack spacing={2}>

                </Stack>
            </Grid>
            <Grid item xs={12} md={4}>
                <PopularCard title="연관 검색어" />
            </Grid>
        </Grid>
      </Box>
      <Box sx={{ display:'flex', justifyContent:'center' }}>
        <Pagination count={10} />
      </Box>
    </Box>
  );
}
