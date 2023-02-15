import { Box, Grid, Pagination, Typography } from '@mui/material'
import React from 'react'
import BoardListItem from 'src/components/BoardListItem'

export default function MainContents() {
    return (
        <Box sx={{ p:'40px 120px', backgroundColor:'rgba(0, 0, 0, 0.05)' }}>
            <Box>
                <Typography sx={{ fontSize:'24px', fontWeight:'500' }}>최신 게시물</Typography>
            </Box>
            <Box sx={{ pt:'20px', pb:'80px' }}>
                <Grid container spacing={3}>
                    <Grid item sm={12} md={8}>
                        <BoardListItem />
                    </Grid>
                    <Grid item sm={12} md={4}></Grid>
                </Grid>
            </Box>
            <Box sx={{ display:'flex', justifyContent:'center' }}>
            <Pagination count={10} />
            </Box>
        </Box>
    )
}
